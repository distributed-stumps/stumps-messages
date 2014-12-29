package com.github.distributed_stumps.stumps.message.provider

import akka.actor.ActorRef
import com.github.distributed_stumps.stumps.message.common._

case class Unregister(host: Host, resource: Resource, heartBeatListener: ActorRef)

