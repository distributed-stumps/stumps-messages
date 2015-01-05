package com.github.distributed_stumps.stumps.message.subscriber

import com.github.distributed_stumps.stumps.message.common.Resource

/**
 * Represents an abstract resource that is / can-be requested from a subscriber. The specific details
 * of the resource can only be defined by the resource-provider.
 *
 * @param name The name of the resource
 * @param zone The zone that the resource resides in
 */
case class ResourceIdentifier(name: String, zone: Option[String])

object ResourceIdentifier {
   def apply(name: String): ResourceIdentifier = ResourceIdentifier(name, None)
   def apply(name: String, zone: String) = ResourceIdentifier(name, Some(zone))
}
