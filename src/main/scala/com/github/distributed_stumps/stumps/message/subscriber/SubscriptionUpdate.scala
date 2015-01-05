package com.github.distributed_stumps.stumps.message.subscriber

import com.github.distributed_stumps.stumps.message.common._

/**
 * A simple class for sending subscription updates. This is used for both scheduled updates and non-critical
 * updates (e.g. new resources added, graceful shutdown of service) but can also be sent out for critical
 * updates (e.g. A service that has gone down unexpectedly).
 *
 * @param updates A list of resource updates. This contains only the deltas from the last
 *                update and not full subscription updates.
 */
case class SubscriptionUpdate(updates: List[(Resource, Location)])
