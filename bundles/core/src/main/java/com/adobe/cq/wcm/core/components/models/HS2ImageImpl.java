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

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.via.ForcedResourceType;

import java.util.List;

@Model(
    adaptables = {Resource.class, SlingHttpServletRequest.class},
    adapters = {Image.class, HS2Image.class},
    resourceType = "core/wcm/components/hs2image"
)
public class HS2ImageImpl implements HS2Image {

    @Self
    @Via(type = ForcedResourceType.class, value = "core/wcm/components/image/v2/image")
    private Image superTypeImage;

    @Override
    public String getSrc() {
        return superTypeImage.getSrc();
    }

    @Override
    public String getAlt() {
        return superTypeImage.getAlt();
    }

    @Override
    public String getTitle() {
        return superTypeImage.getTitle();
    }

    @Override
    public String getLink() {
        return superTypeImage.getLink();
    }

    @Override
    public boolean displayPopupTitle() {
        return superTypeImage.displayPopupTitle();
    }

    @Override
    public String getFileReference() {
        return superTypeImage.getFileReference();
    }

    @Deprecated
    @Override
    public String getJson() {
        return superTypeImage.getJson();
    }

    @Override
    public int[] getWidths() {
        return superTypeImage.getWidths();
    }

    @Override
    public String getSrcUriTemplate() {
        return superTypeImage.getSrcUriTemplate();
    }

    @Override
    public boolean isLazyEnabled() {
        return superTypeImage.isLazyEnabled();
    }

    @Override
    public String getExportedType() {
        return superTypeImage.getExportedType();
    }

    @Override
    public List<ImageArea> getAreas() {
        return superTypeImage.getAreas();
    }
}
