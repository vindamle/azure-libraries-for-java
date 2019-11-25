/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation;

import com.azure.core.http.rest.Page;
import com.azure.core.management.PagedList;
import com.microsoft.azure.management.resources.fluentcore.utils.PagedListConverter;
import com.microsoft.azure.management.resources.implementation.PageImpl;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Base class for readable wrapper collections, i.e. those whose models can only be read, not created.
 * (Internal use only)
 * @param <T> the individual resource type returned
 * @param <ImplT> the individual resource implementation
 * @param <InnerT> the wrapper inner type
 */
public abstract class ReadableWrappersImpl<
        T,
        ImplT extends T,
        InnerT> {

    private final PagedListConverter<InnerT, T> converter;

    protected ReadableWrappersImpl() {
        this.converter = new PagedListConverter<InnerT, T>() {
            @Override
            public Mono<T> typeConvertAsync(InnerT inner) {
                return Mono.just((T) wrapModel(inner));
            }
        };
    }

    protected abstract ImplT wrapModel(InnerT inner);

    protected PagedList<T> wrapList(PagedList<InnerT> pagedList) {
        return converter.convert(pagedList);
    }

    protected PagedList<T> wrapList(List<InnerT> list) {
        return wrapList(ReadableWrappersImpl.convertToPagedList(list));
    }

    /**
     * Converts the List to PagedList.
     * @param list list to be converted in to paged list
     * @param <InnerT> the wrapper inner type
     * @return the Paged list for the inner type.
     */
    public static <InnerT> PagedList<InnerT> convertToPagedList(List<InnerT> list) {
        PageImpl<InnerT> page = new PageImpl<>();
        page.setItems(list);
        page.setNextPageLink(null);
        return new PagedList<InnerT>(page) {
            @Override
            public Page<InnerT> nextPage(String nextPageLink) {
                return null;
            }
        };
    }


    protected Flux<T> wrapPageAsync(Flux<Page<InnerT>> innerPage) {
        return wrapModelAsync(convertPageToInnerAsync(innerPage));
    }

    protected Flux<T> wrapListAsync(Flux<List<InnerT>> innerList) {
        return wrapModelAsync(convertListToInnerAsync(innerList));
    }

    /**
     * Converts Observable of list to Observable of Inner.
     * @param innerList list to be converted.
     * @param <InnerT> type of inner.
     * @return Observable for list of inner.
     */
    public static <InnerT> Flux<InnerT> convertListToInnerAsync(Flux<List<InnerT>> innerList) {
        return innerList.flatMap(u -> Flux.fromIterable(u));

//        return innerList.flatMap(new Func1<List<InnerT>, Observable<InnerT>>() {
//            @Override
//            public Observable<InnerT> call(List<InnerT> inners) {
//                return Observable.from(inners);
//            }
//        });
    }

    /**
     * Converts Observable of page to Observable of Inner.
     * @param <InnerT> type of inner.
     * @param innerPage Page to be converted.
     * @return Observable for list of inner.
     */
    public static <InnerT> Flux<InnerT> convertPageToInnerAsync(Flux<Page<InnerT>> innerPage) {
        return innerPage.flatMap(innerT -> Flux.fromIterable(innerT.getItems()));
//        return innerPage.flatMap(new Func1<Page<InnerT>, Observable<InnerT>>() {
//            @Override
//            public Observable<InnerT> call(Page<InnerT> pageInner) {
//                return Observable.from(pageInner.items());
//            }
//        });
    }

    private Flux<T> wrapModelAsync(Flux<InnerT> inner) {
        return inner.map(innerT -> wrapModel(innerT));
    }
}
