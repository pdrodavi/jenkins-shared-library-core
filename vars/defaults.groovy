/*-
 * #%L
 * pro!vision GmbH
 * %%
 * Copyright (C) 2018 pro!vision GmbH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
import br.dev.pedrodavi.devops.jenkins.pipeline.PipelineConfiguration

/**
 * Helper for trigger defaults
 * @return Default pipeline triggers for all jobs
 */
List getTriggers() {
  List ret = []
  PipelineConfiguration pipelineConfiguration = new PipelineConfiguration(this)
  List scmPollingConfigs = pipelineConfiguration.getDefaultSCMPolling()
  for (String scmPollingConfig in scmPollingConfigs) {
    ret.push(pollSCM(scmPollingConfig))
  }
  return ret
}
