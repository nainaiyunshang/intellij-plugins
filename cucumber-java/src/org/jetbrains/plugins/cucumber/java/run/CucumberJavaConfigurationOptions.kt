// Copyright 2000-2018 JetBrains s.r.o.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package org.jetbrains.plugins.cucumber.java.run

import com.intellij.execution.application.ApplicationConfigurationOptions
import com.intellij.util.xmlb.annotations.OptionTag

open class CucumberJavaConfigurationOptions: ApplicationConfigurationOptions() {
  @get:OptionTag("GLUE")
  open var glue: String? by string()

  @get:OptionTag("FILE_PATH")
  open var filePath: String? by string()

  @get:OptionTag("NAME_FILTER")
  open var nameFilter: String? by string()

  @get:OptionTag("SUGGESTED_NAME")
  open var suggestedName: String? by string()

  @get:OptionTag("CUCUMBER_CORE_VERSION")
  open var cucumberCoreVersion: String? by string()
}