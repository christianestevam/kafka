/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.kafka.tools.consumer.group;

import org.apache.kafka.common.TopicPartition;

import java.util.List;
import java.util.Optional;

class MemberAssignmentState {
    final String group;
    final String consumerId;
    final String host;
    final String clientId;
    final String groupInstanceId;
    final int numPartitions;
    final List<TopicPartition> assignment;
    final List<TopicPartition> targetAssignment;
    final Optional<Integer> currentEpoch;
    final Optional<Integer> targetEpoch;
    final Optional<Boolean> upgraded;

    MemberAssignmentState(
        String group,
        String consumerId,
        String host,
        String clientId,
        String groupInstanceId,
        int numPartitions,
        List<TopicPartition> assignment,
        List<TopicPartition> targetAssignment,
        Optional<Integer> currentEpoch,
        Optional<Integer> targetEpoch,
        Optional<Boolean> upgraded
    ) {
        this.group = group;
        this.consumerId = consumerId;
        this.host = host;
        this.clientId = clientId;
        this.groupInstanceId = groupInstanceId;
        this.numPartitions = numPartitions;
        this.assignment = assignment;
        this.targetAssignment = targetAssignment;
        this.currentEpoch = currentEpoch;
        this.targetEpoch = targetEpoch;
        this.upgraded = upgraded;
    }
}
