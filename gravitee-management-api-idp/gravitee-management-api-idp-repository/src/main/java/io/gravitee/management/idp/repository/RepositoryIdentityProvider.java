/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.management.idp.repository;


import io.gravitee.management.idp.api.IdentityProvider;
import io.gravitee.management.idp.api.authentication.AuthenticationProvider;
import io.gravitee.management.idp.api.identity.IdentityLookup;
import io.gravitee.management.idp.repository.authentication.RepositoryAuthenticationProvider;
import io.gravitee.management.idp.repository.lookup.RepositoryIdentityLookup;

/**
 * @author David BRASSELY (david at gravitee.io)
 * @author GraviteeSource Team
 */
public class RepositoryIdentityProvider implements IdentityProvider {

    public final static String PROVIDER_TYPE = "gravitee";

    @Override
    public String type() {
        return PROVIDER_TYPE;
    }

    @Override
    public Class<? extends AuthenticationProvider> authenticationProvider() {
        return RepositoryAuthenticationProvider.class;
    }

    @Override
    public Class<? extends IdentityLookup> identityLookup() {
        return RepositoryIdentityLookup.class;
    }

}
