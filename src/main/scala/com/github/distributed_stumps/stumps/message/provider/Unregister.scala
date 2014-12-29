package com.github.scalable_tech.stumps.message.provider

import akka.actor.ActorRef
import io.johnmurray.akkanamenode.message.common._

case class Unregister(host: Host, resource: Resource, heartBeatListener: ActorRef)

