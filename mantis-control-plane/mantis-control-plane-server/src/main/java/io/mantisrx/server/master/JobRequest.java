/*
 * Copyright 2019 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.mantisrx.server.master;

import io.mantisrx.runtime.MantisJobDefinition;
import io.mantisrx.server.master.scheduler.MantisScheduler;
import io.mantisrx.server.master.store.NamedJob;


public class JobRequest {

    private String jobId;
    private MantisJobDefinition jobDefinition;

    public JobRequest(final String jobId,
                      final MantisJobDefinition jobDefinition,
                      final NamedJob namedJob,
                      final MantisScheduler scheduler,
                      final VirtualMachineMasterService vmService) {
        this.jobId = jobId;
        this.jobDefinition = jobDefinition;
    }

    public String getJobId() {
        return jobId;
    }

    public MantisJobDefinition getJobDefinition() {
        return jobDefinition;
    }

}
