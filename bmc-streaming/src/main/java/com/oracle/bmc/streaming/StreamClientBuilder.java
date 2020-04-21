/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

public class StreamClientBuilder
        extends AbstractStreamBasedClientBuilder<StreamClientBuilder, StreamClient> {
    public StreamClientBuilder(Service service) {
        super(service);
    }

    @Override
    public StreamClient build(AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        String cryptoEndpoint = getEndpoint();

        return new StreamClient(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                additionalClientConfigurators,
                cryptoEndpoint);
    }
}
