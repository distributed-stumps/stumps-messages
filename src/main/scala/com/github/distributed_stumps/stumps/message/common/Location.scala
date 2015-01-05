package com.github.distributed_stumps.stumps.message.common

import java.net.InetAddress

case class Location(ipAddress: Option[InetAddress], hostname: Option[String], zone: String)
