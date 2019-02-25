/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2017 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models;

import java.util.Map;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.via.ForcedResourceType;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.wcm.core.components.models.form.Container;

@Model(
    adaptables = {Resource.class, SlingHttpServletRequest.class},
    adapters = {Container.class, HS2Container.class},
    resourceType = "core/wcm/components/hs2container"
)
public class HS2ContainerImpl implements HS2Container {
    @Self
    @Via(type = ForcedResourceType.class, value = "core/wcm/components/form/container/v2/container")
    private Container superTypeContainer;

    @Override
    public String getMethod() {
        return superTypeContainer.getMethod();
    }

    @Override
    public String getAction() {
        return superTypeContainer.getAction();
    }

    @Override
    public String getId() {
        return superTypeContainer.getId();
    }

    @Override
    public String getName() {
        return superTypeContainer.getName();
    }

    @Override
    public String getEnctype() {
        return superTypeContainer.getEnctype();
    }

    @Override
    public String getResourceTypeForDropArea() {
        return superTypeContainer.getResourceTypeForDropArea();
    }

    @Override
    public String getRedirect() {
        return superTypeContainer.getRedirect();
    }

    @Override
    public String[] getExportedItemsOrder() {
        return superTypeContainer.getExportedItemsOrder();
    }

    @Override
    public Map<String, ? extends ComponentExporter> getExportedItems() {
        return superTypeContainer.getExportedItems();
    }

    @Override
    public String getExportedType() {
        return superTypeContainer.getExportedType();
    }
}
