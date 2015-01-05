package com.github.distributed_stumps.stumps.message.common

import java.net.URI

case class Resource(name: String, uri: URI, meta: Map[String, Any])
