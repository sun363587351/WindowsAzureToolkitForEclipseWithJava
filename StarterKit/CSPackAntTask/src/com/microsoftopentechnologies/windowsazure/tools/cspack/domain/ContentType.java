/*
 Copyright 2015 Microsoft Open Technologies, Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */


package com.microsoftopentechnologies.windowsazure.tools.cspack.domain;

public class ContentType {
    private final String partName;
    private final String CONTENT_TYPE = "application/octet-stream";      // so far default value

    public ContentType(String partName) {
        this.partName = partName;
    }

    public String getPartName() {
        return partName;
    }

    public String getContentType() {
        return CONTENT_TYPE;
    }
}