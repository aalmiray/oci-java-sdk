/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog;

import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataCatalog where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.RequiredArgsConstructor
public class DataCatalogPaginators {
    private final DataCatalog client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listAttributeTags operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAttributeTagsResponse> listAttributeTagsResponseIterator(
            final ListAttributeTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAttributeTagsRequest.Builder, ListAttributeTagsRequest,
                ListAttributeTagsResponse>(
                new com.google.common.base.Supplier<ListAttributeTagsRequest.Builder>() {
                    @Override
                    public ListAttributeTagsRequest.Builder get() {
                        return ListAttributeTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAttributeTagsResponse, String>() {
                    @Override
                    public String apply(ListAttributeTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttributeTagsRequest.Builder>,
                        ListAttributeTagsRequest>() {
                    @Override
                    public ListAttributeTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttributeTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListAttributeTagsRequest, ListAttributeTagsResponse>() {
                    @Override
                    public ListAttributeTagsResponse apply(ListAttributeTagsRequest request) {
                        return client.listAttributeTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.AttributeTagSummary} objects
     * contained in responses from the listAttributeTags operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.AttributeTagSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.AttributeTagSummary>
            listAttributeTagsRecordIterator(final ListAttributeTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAttributeTagsRequest.Builder, ListAttributeTagsRequest,
                ListAttributeTagsResponse, com.oracle.bmc.datacatalog.model.AttributeTagSummary>(
                new com.google.common.base.Supplier<ListAttributeTagsRequest.Builder>() {
                    @Override
                    public ListAttributeTagsRequest.Builder get() {
                        return ListAttributeTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAttributeTagsResponse, String>() {
                    @Override
                    public String apply(ListAttributeTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttributeTagsRequest.Builder>,
                        ListAttributeTagsRequest>() {
                    @Override
                    public ListAttributeTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttributeTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListAttributeTagsRequest, ListAttributeTagsResponse>() {
                    @Override
                    public ListAttributeTagsResponse apply(ListAttributeTagsRequest request) {
                        return client.listAttributeTags(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAttributeTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.AttributeTagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.AttributeTagSummary>
                            apply(ListAttributeTagsResponse response) {
                        return response.getAttributeTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAttributes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAttributesResponse> listAttributesResponseIterator(
            final ListAttributesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAttributesRequest.Builder, ListAttributesRequest, ListAttributesResponse>(
                new com.google.common.base.Supplier<ListAttributesRequest.Builder>() {
                    @Override
                    public ListAttributesRequest.Builder get() {
                        return ListAttributesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAttributesResponse, String>() {
                    @Override
                    public String apply(ListAttributesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttributesRequest.Builder>,
                        ListAttributesRequest>() {
                    @Override
                    public ListAttributesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttributesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListAttributesRequest, ListAttributesResponse>() {
                    @Override
                    public ListAttributesResponse apply(ListAttributesRequest request) {
                        return client.listAttributes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.AttributeSummary} objects
     * contained in responses from the listAttributes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.AttributeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.AttributeSummary> listAttributesRecordIterator(
            final ListAttributesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAttributesRequest.Builder, ListAttributesRequest, ListAttributesResponse,
                com.oracle.bmc.datacatalog.model.AttributeSummary>(
                new com.google.common.base.Supplier<ListAttributesRequest.Builder>() {
                    @Override
                    public ListAttributesRequest.Builder get() {
                        return ListAttributesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAttributesResponse, String>() {
                    @Override
                    public String apply(ListAttributesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAttributesRequest.Builder>,
                        ListAttributesRequest>() {
                    @Override
                    public ListAttributesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAttributesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListAttributesRequest, ListAttributesResponse>() {
                    @Override
                    public ListAttributesResponse apply(ListAttributesRequest request) {
                        return client.listAttributes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAttributesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.AttributeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.AttributeSummary> apply(
                            ListAttributesResponse response) {
                        return response.getAttributeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCatalogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCatalogsResponse> listCatalogsResponseIterator(
            final ListCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCatalogsRequest.Builder, ListCatalogsRequest, ListCatalogsResponse>(
                new com.google.common.base.Supplier<ListCatalogsRequest.Builder>() {
                    @Override
                    public ListCatalogsRequest.Builder get() {
                        return ListCatalogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCatalogsResponse, String>() {
                    @Override
                    public String apply(ListCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCatalogsRequest.Builder>,
                        ListCatalogsRequest>() {
                    @Override
                    public ListCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCatalogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListCatalogsRequest, ListCatalogsResponse>() {
                    @Override
                    public ListCatalogsResponse apply(ListCatalogsRequest request) {
                        return client.listCatalogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.CatalogSummary} objects
     * contained in responses from the listCatalogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.CatalogSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.CatalogSummary> listCatalogsRecordIterator(
            final ListCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCatalogsRequest.Builder, ListCatalogsRequest, ListCatalogsResponse,
                com.oracle.bmc.datacatalog.model.CatalogSummary>(
                new com.google.common.base.Supplier<ListCatalogsRequest.Builder>() {
                    @Override
                    public ListCatalogsRequest.Builder get() {
                        return ListCatalogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCatalogsResponse, String>() {
                    @Override
                    public String apply(ListCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCatalogsRequest.Builder>,
                        ListCatalogsRequest>() {
                    @Override
                    public ListCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCatalogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListCatalogsRequest, ListCatalogsResponse>() {
                    @Override
                    public ListCatalogsResponse apply(ListCatalogsRequest request) {
                        return client.listCatalogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCatalogsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.CatalogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.CatalogSummary> apply(
                            ListCatalogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConnectionsResponse> listConnectionsResponseIterator(
            final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse>(
                new com.google.common.base.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.ConnectionSummary} objects
     * contained in responses from the listConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.ConnectionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.ConnectionSummary>
            listConnectionsRecordIterator(final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse,
                com.oracle.bmc.datacatalog.model.ConnectionSummary>(
                new com.google.common.base.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                },
                new com.google.common.base.Function<
                        ListConnectionsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.ConnectionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.ConnectionSummary> apply(
                            ListConnectionsResponse response) {
                        return response.getConnectionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataAssetTags operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataAssetTagsResponse> listDataAssetTagsResponseIterator(
            final ListDataAssetTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataAssetTagsRequest.Builder, ListDataAssetTagsRequest,
                ListDataAssetTagsResponse>(
                new com.google.common.base.Supplier<ListDataAssetTagsRequest.Builder>() {
                    @Override
                    public ListDataAssetTagsRequest.Builder get() {
                        return ListDataAssetTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataAssetTagsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetTagsRequest.Builder>,
                        ListDataAssetTagsRequest>() {
                    @Override
                    public ListDataAssetTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDataAssetTagsRequest, ListDataAssetTagsResponse>() {
                    @Override
                    public ListDataAssetTagsResponse apply(ListDataAssetTagsRequest request) {
                        return client.listDataAssetTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.DataAssetTagSummary} objects
     * contained in responses from the listDataAssetTags operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.DataAssetTagSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.DataAssetTagSummary>
            listDataAssetTagsRecordIterator(final ListDataAssetTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAssetTagsRequest.Builder, ListDataAssetTagsRequest,
                ListDataAssetTagsResponse, com.oracle.bmc.datacatalog.model.DataAssetTagSummary>(
                new com.google.common.base.Supplier<ListDataAssetTagsRequest.Builder>() {
                    @Override
                    public ListDataAssetTagsRequest.Builder get() {
                        return ListDataAssetTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataAssetTagsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetTagsRequest.Builder>,
                        ListDataAssetTagsRequest>() {
                    @Override
                    public ListDataAssetTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDataAssetTagsRequest, ListDataAssetTagsResponse>() {
                    @Override
                    public ListDataAssetTagsResponse apply(ListDataAssetTagsRequest request) {
                        return client.listDataAssetTags(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataAssetTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.DataAssetTagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.DataAssetTagSummary>
                            apply(ListDataAssetTagsResponse response) {
                        return response.getDataAssetTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataAssets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataAssetsResponse> listDataAssetsResponseIterator(
            final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataAssetsRequest.Builder, ListDataAssetsRequest, ListDataAssetsResponse>(
                new com.google.common.base.Supplier<ListDataAssetsRequest.Builder>() {
                    @Override
                    public ListDataAssetsRequest.Builder get() {
                        return ListDataAssetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataAssetsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetsRequest.Builder>,
                        ListDataAssetsRequest>() {
                    @Override
                    public ListDataAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDataAssetsRequest, ListDataAssetsResponse>() {
                    @Override
                    public ListDataAssetsResponse apply(ListDataAssetsRequest request) {
                        return client.listDataAssets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.DataAssetSummary} objects
     * contained in responses from the listDataAssets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.DataAssetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.DataAssetSummary> listDataAssetsRecordIterator(
            final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAssetsRequest.Builder, ListDataAssetsRequest, ListDataAssetsResponse,
                com.oracle.bmc.datacatalog.model.DataAssetSummary>(
                new com.google.common.base.Supplier<ListDataAssetsRequest.Builder>() {
                    @Override
                    public ListDataAssetsRequest.Builder get() {
                        return ListDataAssetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataAssetsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetsRequest.Builder>,
                        ListDataAssetsRequest>() {
                    @Override
                    public ListDataAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListDataAssetsRequest, ListDataAssetsResponse>() {
                    @Override
                    public ListDataAssetsResponse apply(ListDataAssetsRequest request) {
                        return client.listDataAssets(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataAssetsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.DataAssetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.DataAssetSummary> apply(
                            ListDataAssetsResponse response) {
                        return response.getDataAssetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEntitiesResponse> listEntitiesResponseIterator(
            final ListEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntitiesRequest.Builder, ListEntitiesRequest, ListEntitiesResponse>(
                new com.google.common.base.Supplier<ListEntitiesRequest.Builder>() {
                    @Override
                    public ListEntitiesRequest.Builder get() {
                        return ListEntitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEntitiesResponse, String>() {
                    @Override
                    public String apply(ListEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitiesRequest.Builder>,
                        ListEntitiesRequest>() {
                    @Override
                    public ListEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitiesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListEntitiesRequest, ListEntitiesResponse>() {
                    @Override
                    public ListEntitiesResponse apply(ListEntitiesRequest request) {
                        return client.listEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.EntitySummary} objects
     * contained in responses from the listEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.EntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.EntitySummary> listEntitiesRecordIterator(
            final ListEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntitiesRequest.Builder, ListEntitiesRequest, ListEntitiesResponse,
                com.oracle.bmc.datacatalog.model.EntitySummary>(
                new com.google.common.base.Supplier<ListEntitiesRequest.Builder>() {
                    @Override
                    public ListEntitiesRequest.Builder get() {
                        return ListEntitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEntitiesResponse, String>() {
                    @Override
                    public String apply(ListEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitiesRequest.Builder>,
                        ListEntitiesRequest>() {
                    @Override
                    public ListEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitiesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListEntitiesRequest, ListEntitiesResponse>() {
                    @Override
                    public ListEntitiesResponse apply(ListEntitiesRequest request) {
                        return client.listEntities(request);
                    }
                },
                new com.google.common.base.Function<
                        ListEntitiesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.EntitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.EntitySummary> apply(
                            ListEntitiesResponse response) {
                        return response.getEntityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEntityTags operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEntityTagsResponse> listEntityTagsResponseIterator(
            final ListEntityTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntityTagsRequest.Builder, ListEntityTagsRequest, ListEntityTagsResponse>(
                new com.google.common.base.Supplier<ListEntityTagsRequest.Builder>() {
                    @Override
                    public ListEntityTagsRequest.Builder get() {
                        return ListEntityTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEntityTagsResponse, String>() {
                    @Override
                    public String apply(ListEntityTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntityTagsRequest.Builder>,
                        ListEntityTagsRequest>() {
                    @Override
                    public ListEntityTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntityTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListEntityTagsRequest, ListEntityTagsResponse>() {
                    @Override
                    public ListEntityTagsResponse apply(ListEntityTagsRequest request) {
                        return client.listEntityTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.EntityTagSummary} objects
     * contained in responses from the listEntityTags operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.EntityTagSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.EntityTagSummary> listEntityTagsRecordIterator(
            final ListEntityTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntityTagsRequest.Builder, ListEntityTagsRequest, ListEntityTagsResponse,
                com.oracle.bmc.datacatalog.model.EntityTagSummary>(
                new com.google.common.base.Supplier<ListEntityTagsRequest.Builder>() {
                    @Override
                    public ListEntityTagsRequest.Builder get() {
                        return ListEntityTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEntityTagsResponse, String>() {
                    @Override
                    public String apply(ListEntityTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntityTagsRequest.Builder>,
                        ListEntityTagsRequest>() {
                    @Override
                    public ListEntityTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntityTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListEntityTagsRequest, ListEntityTagsResponse>() {
                    @Override
                    public ListEntityTagsResponse apply(ListEntityTagsRequest request) {
                        return client.listEntityTags(request);
                    }
                },
                new com.google.common.base.Function<
                        ListEntityTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.EntityTagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.EntityTagSummary> apply(
                            ListEntityTagsResponse response) {
                        return response.getEntityTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFolderTags operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFolderTagsResponse> listFolderTagsResponseIterator(
            final ListFolderTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFolderTagsRequest.Builder, ListFolderTagsRequest, ListFolderTagsResponse>(
                new com.google.common.base.Supplier<ListFolderTagsRequest.Builder>() {
                    @Override
                    public ListFolderTagsRequest.Builder get() {
                        return ListFolderTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFolderTagsResponse, String>() {
                    @Override
                    public String apply(ListFolderTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFolderTagsRequest.Builder>,
                        ListFolderTagsRequest>() {
                    @Override
                    public ListFolderTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFolderTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListFolderTagsRequest, ListFolderTagsResponse>() {
                    @Override
                    public ListFolderTagsResponse apply(ListFolderTagsRequest request) {
                        return client.listFolderTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.FolderTagSummary} objects
     * contained in responses from the listFolderTags operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.FolderTagSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.FolderTagSummary> listFolderTagsRecordIterator(
            final ListFolderTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFolderTagsRequest.Builder, ListFolderTagsRequest, ListFolderTagsResponse,
                com.oracle.bmc.datacatalog.model.FolderTagSummary>(
                new com.google.common.base.Supplier<ListFolderTagsRequest.Builder>() {
                    @Override
                    public ListFolderTagsRequest.Builder get() {
                        return ListFolderTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFolderTagsResponse, String>() {
                    @Override
                    public String apply(ListFolderTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFolderTagsRequest.Builder>,
                        ListFolderTagsRequest>() {
                    @Override
                    public ListFolderTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFolderTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListFolderTagsRequest, ListFolderTagsResponse>() {
                    @Override
                    public ListFolderTagsResponse apply(ListFolderTagsRequest request) {
                        return client.listFolderTags(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFolderTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.FolderTagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.FolderTagSummary> apply(
                            ListFolderTagsResponse response) {
                        return response.getFolderTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFolders operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFoldersResponse> listFoldersResponseIterator(
            final ListFoldersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFoldersRequest.Builder, ListFoldersRequest, ListFoldersResponse>(
                new com.google.common.base.Supplier<ListFoldersRequest.Builder>() {
                    @Override
                    public ListFoldersRequest.Builder get() {
                        return ListFoldersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFoldersResponse, String>() {
                    @Override
                    public String apply(ListFoldersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFoldersRequest.Builder>,
                        ListFoldersRequest>() {
                    @Override
                    public ListFoldersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFoldersRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListFoldersRequest, ListFoldersResponse>() {
                    @Override
                    public ListFoldersResponse apply(ListFoldersRequest request) {
                        return client.listFolders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.FolderSummary} objects
     * contained in responses from the listFolders operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.FolderSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.FolderSummary> listFoldersRecordIterator(
            final ListFoldersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFoldersRequest.Builder, ListFoldersRequest, ListFoldersResponse,
                com.oracle.bmc.datacatalog.model.FolderSummary>(
                new com.google.common.base.Supplier<ListFoldersRequest.Builder>() {
                    @Override
                    public ListFoldersRequest.Builder get() {
                        return ListFoldersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFoldersResponse, String>() {
                    @Override
                    public String apply(ListFoldersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFoldersRequest.Builder>,
                        ListFoldersRequest>() {
                    @Override
                    public ListFoldersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFoldersRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListFoldersRequest, ListFoldersResponse>() {
                    @Override
                    public ListFoldersResponse apply(ListFoldersRequest request) {
                        return client.listFolders(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFoldersResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.FolderSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.FolderSummary> apply(
                            ListFoldersResponse response) {
                        return response.getFolderCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGlossaries operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGlossariesResponse> listGlossariesResponseIterator(
            final ListGlossariesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGlossariesRequest.Builder, ListGlossariesRequest, ListGlossariesResponse>(
                new com.google.common.base.Supplier<ListGlossariesRequest.Builder>() {
                    @Override
                    public ListGlossariesRequest.Builder get() {
                        return ListGlossariesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGlossariesResponse, String>() {
                    @Override
                    public String apply(ListGlossariesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGlossariesRequest.Builder>,
                        ListGlossariesRequest>() {
                    @Override
                    public ListGlossariesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGlossariesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListGlossariesRequest, ListGlossariesResponse>() {
                    @Override
                    public ListGlossariesResponse apply(ListGlossariesRequest request) {
                        return client.listGlossaries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.GlossarySummary} objects
     * contained in responses from the listGlossaries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.GlossarySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.GlossarySummary> listGlossariesRecordIterator(
            final ListGlossariesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGlossariesRequest.Builder, ListGlossariesRequest, ListGlossariesResponse,
                com.oracle.bmc.datacatalog.model.GlossarySummary>(
                new com.google.common.base.Supplier<ListGlossariesRequest.Builder>() {
                    @Override
                    public ListGlossariesRequest.Builder get() {
                        return ListGlossariesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGlossariesResponse, String>() {
                    @Override
                    public String apply(ListGlossariesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGlossariesRequest.Builder>,
                        ListGlossariesRequest>() {
                    @Override
                    public ListGlossariesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGlossariesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListGlossariesRequest, ListGlossariesResponse>() {
                    @Override
                    public ListGlossariesResponse apply(ListGlossariesRequest request) {
                        return client.listGlossaries(request);
                    }
                },
                new com.google.common.base.Function<
                        ListGlossariesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.GlossarySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.GlossarySummary> apply(
                            ListGlossariesResponse response) {
                        return response.getGlossaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobDefinitions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobDefinitionsResponse> listJobDefinitionsResponseIterator(
            final ListJobDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobDefinitionsRequest.Builder, ListJobDefinitionsRequest,
                ListJobDefinitionsResponse>(
                new com.google.common.base.Supplier<ListJobDefinitionsRequest.Builder>() {
                    @Override
                    public ListJobDefinitionsRequest.Builder get() {
                        return ListJobDefinitionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListJobDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobDefinitionsRequest.Builder>,
                        ListJobDefinitionsRequest>() {
                    @Override
                    public ListJobDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobDefinitionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListJobDefinitionsRequest, ListJobDefinitionsResponse>() {
                    @Override
                    public ListJobDefinitionsResponse apply(ListJobDefinitionsRequest request) {
                        return client.listJobDefinitions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.JobDefinitionSummary} objects
     * contained in responses from the listJobDefinitions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.JobDefinitionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobDefinitionSummary>
            listJobDefinitionsRecordIterator(final ListJobDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobDefinitionsRequest.Builder, ListJobDefinitionsRequest,
                ListJobDefinitionsResponse, com.oracle.bmc.datacatalog.model.JobDefinitionSummary>(
                new com.google.common.base.Supplier<ListJobDefinitionsRequest.Builder>() {
                    @Override
                    public ListJobDefinitionsRequest.Builder get() {
                        return ListJobDefinitionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListJobDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobDefinitionsRequest.Builder>,
                        ListJobDefinitionsRequest>() {
                    @Override
                    public ListJobDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobDefinitionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListJobDefinitionsRequest, ListJobDefinitionsResponse>() {
                    @Override
                    public ListJobDefinitionsResponse apply(ListJobDefinitionsRequest request) {
                        return client.listJobDefinitions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListJobDefinitionsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobDefinitionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobDefinitionSummary>
                            apply(ListJobDefinitionsResponse response) {
                        return response.getJobDefinitionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobExecutions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobExecutionsResponse> listJobExecutionsResponseIterator(
            final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobExecutionsRequest.Builder, ListJobExecutionsRequest,
                ListJobExecutionsResponse>(
                new com.google.common.base.Supplier<ListJobExecutionsRequest.Builder>() {
                    @Override
                    public ListJobExecutionsRequest.Builder get() {
                        return ListJobExecutionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobExecutionsResponse, String>() {
                    @Override
                    public String apply(ListJobExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobExecutionsRequest.Builder>,
                        ListJobExecutionsRequest>() {
                    @Override
                    public ListJobExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobExecutionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListJobExecutionsRequest, ListJobExecutionsResponse>() {
                    @Override
                    public ListJobExecutionsResponse apply(ListJobExecutionsRequest request) {
                        return client.listJobExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.JobExecutionSummary} objects
     * contained in responses from the listJobExecutions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.JobExecutionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobExecutionSummary>
            listJobExecutionsRecordIterator(final ListJobExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobExecutionsRequest.Builder, ListJobExecutionsRequest,
                ListJobExecutionsResponse, com.oracle.bmc.datacatalog.model.JobExecutionSummary>(
                new com.google.common.base.Supplier<ListJobExecutionsRequest.Builder>() {
                    @Override
                    public ListJobExecutionsRequest.Builder get() {
                        return ListJobExecutionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobExecutionsResponse, String>() {
                    @Override
                    public String apply(ListJobExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobExecutionsRequest.Builder>,
                        ListJobExecutionsRequest>() {
                    @Override
                    public ListJobExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobExecutionsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListJobExecutionsRequest, ListJobExecutionsResponse>() {
                    @Override
                    public ListJobExecutionsResponse apply(ListJobExecutionsRequest request) {
                        return client.listJobExecutions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListJobExecutionsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobExecutionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobExecutionSummary>
                            apply(ListJobExecutionsResponse response) {
                        return response.getJobExecutionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobLogsResponse> listJobLogsResponseIterator(
            final ListJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobLogsRequest.Builder, ListJobLogsRequest, ListJobLogsResponse>(
                new com.google.common.base.Supplier<ListJobLogsRequest.Builder>() {
                    @Override
                    public ListJobLogsRequest.Builder get() {
                        return ListJobLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobLogsResponse, String>() {
                    @Override
                    public String apply(ListJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobLogsRequest.Builder>,
                        ListJobLogsRequest>() {
                    @Override
                    public ListJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListJobLogsRequest, ListJobLogsResponse>() {
                    @Override
                    public ListJobLogsResponse apply(ListJobLogsRequest request) {
                        return client.listJobLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.JobLogSummary} objects
     * contained in responses from the listJobLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.JobLogSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobLogSummary> listJobLogsRecordIterator(
            final ListJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobLogsRequest.Builder, ListJobLogsRequest, ListJobLogsResponse,
                com.oracle.bmc.datacatalog.model.JobLogSummary>(
                new com.google.common.base.Supplier<ListJobLogsRequest.Builder>() {
                    @Override
                    public ListJobLogsRequest.Builder get() {
                        return ListJobLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobLogsResponse, String>() {
                    @Override
                    public String apply(ListJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobLogsRequest.Builder>,
                        ListJobLogsRequest>() {
                    @Override
                    public ListJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListJobLogsRequest, ListJobLogsResponse>() {
                    @Override
                    public ListJobLogsResponse apply(ListJobLogsRequest request) {
                        return client.listJobLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListJobLogsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobLogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobLogSummary> apply(
                            ListJobLogsResponse response) {
                        return response.getJobLogCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobMetrics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobMetricsResponse> listJobMetricsResponseIterator(
            final ListJobMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobMetricsRequest.Builder, ListJobMetricsRequest, ListJobMetricsResponse>(
                new com.google.common.base.Supplier<ListJobMetricsRequest.Builder>() {
                    @Override
                    public ListJobMetricsRequest.Builder get() {
                        return ListJobMetricsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobMetricsResponse, String>() {
                    @Override
                    public String apply(ListJobMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobMetricsRequest.Builder>,
                        ListJobMetricsRequest>() {
                    @Override
                    public ListJobMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobMetricsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListJobMetricsRequest, ListJobMetricsResponse>() {
                    @Override
                    public ListJobMetricsResponse apply(ListJobMetricsRequest request) {
                        return client.listJobMetrics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.JobMetricSummary} objects
     * contained in responses from the listJobMetrics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.JobMetricSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobMetricSummary> listJobMetricsRecordIterator(
            final ListJobMetricsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobMetricsRequest.Builder, ListJobMetricsRequest, ListJobMetricsResponse,
                com.oracle.bmc.datacatalog.model.JobMetricSummary>(
                new com.google.common.base.Supplier<ListJobMetricsRequest.Builder>() {
                    @Override
                    public ListJobMetricsRequest.Builder get() {
                        return ListJobMetricsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobMetricsResponse, String>() {
                    @Override
                    public String apply(ListJobMetricsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobMetricsRequest.Builder>,
                        ListJobMetricsRequest>() {
                    @Override
                    public ListJobMetricsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobMetricsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListJobMetricsRequest, ListJobMetricsResponse>() {
                    @Override
                    public ListJobMetricsResponse apply(ListJobMetricsRequest request) {
                        return client.listJobMetrics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListJobMetricsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobMetricSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobMetricSummary> apply(
                            ListJobMetricsResponse response) {
                        return response.getJobMetricCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobsResponse> listJobsResponseIterator(final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse>(
                new com.google.common.base.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.JobSummary} objects
     * contained in responses from the listJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.JobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse,
                com.oracle.bmc.datacatalog.model.JobSummary>(
                new com.google.common.base.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListJobsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.JobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.JobSummary> apply(
                            ListJobsResponse response) {
                        return response.getJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTags operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTagsResponse> listTagsResponseIterator(final ListTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTagsRequest.Builder, ListTagsRequest, ListTagsResponse>(
                new com.google.common.base.Supplier<ListTagsRequest.Builder>() {
                    @Override
                    public ListTagsRequest.Builder get() {
                        return ListTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTagsResponse, String>() {
                    @Override
                    public String apply(ListTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagsRequest.Builder>,
                        ListTagsRequest>() {
                    @Override
                    public ListTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListTagsRequest, ListTagsResponse>() {
                    @Override
                    public ListTagsResponse apply(ListTagsRequest request) {
                        return client.listTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.TermSummary} objects
     * contained in responses from the listTags operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.TermSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.TermSummary> listTagsRecordIterator(
            final ListTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTagsRequest.Builder, ListTagsRequest, ListTagsResponse,
                com.oracle.bmc.datacatalog.model.TermSummary>(
                new com.google.common.base.Supplier<ListTagsRequest.Builder>() {
                    @Override
                    public ListTagsRequest.Builder get() {
                        return ListTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTagsResponse, String>() {
                    @Override
                    public String apply(ListTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagsRequest.Builder>,
                        ListTagsRequest>() {
                    @Override
                    public ListTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListTagsRequest, ListTagsResponse>() {
                    @Override
                    public ListTagsResponse apply(ListTagsRequest request) {
                        return client.listTags(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTagsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.TermSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.TermSummary> apply(
                            ListTagsResponse response) {
                        return response.getTermCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTermRelationships operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTermRelationshipsResponse> listTermRelationshipsResponseIterator(
            final ListTermRelationshipsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTermRelationshipsRequest.Builder, ListTermRelationshipsRequest,
                ListTermRelationshipsResponse>(
                new com.google.common.base.Supplier<ListTermRelationshipsRequest.Builder>() {
                    @Override
                    public ListTermRelationshipsRequest.Builder get() {
                        return ListTermRelationshipsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTermRelationshipsResponse, String>() {
                    @Override
                    public String apply(ListTermRelationshipsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermRelationshipsRequest.Builder>,
                        ListTermRelationshipsRequest>() {
                    @Override
                    public ListTermRelationshipsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermRelationshipsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListTermRelationshipsRequest, ListTermRelationshipsResponse>() {
                    @Override
                    public ListTermRelationshipsResponse apply(
                            ListTermRelationshipsRequest request) {
                        return client.listTermRelationships(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.TermRelationshipSummary} objects
     * contained in responses from the listTermRelationships operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.TermRelationshipSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.TermRelationshipSummary>
            listTermRelationshipsRecordIterator(final ListTermRelationshipsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTermRelationshipsRequest.Builder, ListTermRelationshipsRequest,
                ListTermRelationshipsResponse,
                com.oracle.bmc.datacatalog.model.TermRelationshipSummary>(
                new com.google.common.base.Supplier<ListTermRelationshipsRequest.Builder>() {
                    @Override
                    public ListTermRelationshipsRequest.Builder get() {
                        return ListTermRelationshipsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTermRelationshipsResponse, String>() {
                    @Override
                    public String apply(ListTermRelationshipsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermRelationshipsRequest.Builder>,
                        ListTermRelationshipsRequest>() {
                    @Override
                    public ListTermRelationshipsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermRelationshipsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListTermRelationshipsRequest, ListTermRelationshipsResponse>() {
                    @Override
                    public ListTermRelationshipsResponse apply(
                            ListTermRelationshipsRequest request) {
                        return client.listTermRelationships(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTermRelationshipsResponse,
                        java.util.List<
                                com.oracle.bmc.datacatalog.model.TermRelationshipSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.TermRelationshipSummary>
                            apply(ListTermRelationshipsResponse response) {
                        return response.getTermRelationshipCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTerms operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTermsResponse> listTermsResponseIterator(final ListTermsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTermsRequest.Builder, ListTermsRequest, ListTermsResponse>(
                new com.google.common.base.Supplier<ListTermsRequest.Builder>() {
                    @Override
                    public ListTermsRequest.Builder get() {
                        return ListTermsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTermsResponse, String>() {
                    @Override
                    public String apply(ListTermsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermsRequest.Builder>,
                        ListTermsRequest>() {
                    @Override
                    public ListTermsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListTermsRequest, ListTermsResponse>() {
                    @Override
                    public ListTermsResponse apply(ListTermsRequest request) {
                        return client.listTerms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.TermSummary} objects
     * contained in responses from the listTerms operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.TermSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.TermSummary> listTermsRecordIterator(
            final ListTermsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTermsRequest.Builder, ListTermsRequest, ListTermsResponse,
                com.oracle.bmc.datacatalog.model.TermSummary>(
                new com.google.common.base.Supplier<ListTermsRequest.Builder>() {
                    @Override
                    public ListTermsRequest.Builder get() {
                        return ListTermsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTermsResponse, String>() {
                    @Override
                    public String apply(ListTermsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTermsRequest.Builder>,
                        ListTermsRequest>() {
                    @Override
                    public ListTermsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTermsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListTermsRequest, ListTermsResponse>() {
                    @Override
                    public ListTermsResponse apply(ListTermsRequest request) {
                        return client.listTerms(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTermsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.TermSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.TermSummary> apply(
                            ListTermsResponse response) {
                        return response.getTermCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTypesResponse> listTypesResponseIterator(final ListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTypesRequest.Builder, ListTypesRequest, ListTypesResponse>(
                new com.google.common.base.Supplier<ListTypesRequest.Builder>() {
                    @Override
                    public ListTypesRequest.Builder get() {
                        return ListTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTypesResponse, String>() {
                    @Override
                    public String apply(ListTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTypesRequest.Builder>,
                        ListTypesRequest>() {
                    @Override
                    public ListTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTypesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListTypesRequest, ListTypesResponse>() {
                    @Override
                    public ListTypesResponse apply(ListTypesRequest request) {
                        return client.listTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.TypeSummary} objects
     * contained in responses from the listTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.TypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.TypeSummary> listTypesRecordIterator(
            final ListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTypesRequest.Builder, ListTypesRequest, ListTypesResponse,
                com.oracle.bmc.datacatalog.model.TypeSummary>(
                new com.google.common.base.Supplier<ListTypesRequest.Builder>() {
                    @Override
                    public ListTypesRequest.Builder get() {
                        return ListTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTypesResponse, String>() {
                    @Override
                    public String apply(ListTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTypesRequest.Builder>,
                        ListTypesRequest>() {
                    @Override
                    public ListTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTypesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListTypesRequest, ListTypesResponse>() {
                    @Override
                    public ListTypesResponse apply(ListTypesRequest request) {
                        return client.listTypes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTypesResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.TypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.TypeSummary> apply(
                            ListTypesResponse response) {
                        return response.getTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.datacatalog.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.WorkRequestLog} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.WorkRequestLog} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.WorkRequestLog>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.datacatalog.model.WorkRequestLog>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.WorkRequestLog>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.WorkRequestLog> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datacatalog.model.WorkRequest} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datacatalog.model.WorkRequest} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datacatalog.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.datacatalog.model.WorkRequest>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.datacatalog.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datacatalog.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
