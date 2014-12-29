package com.github.distributed_stumps.stumps.message.subscriber

import com.github.distributed_stumps.stumps.message.common.Resource

case class ResourceIdentifier(datacenter: String, resource: Resource)
