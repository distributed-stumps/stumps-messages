package com.github.scalable_tech.stumps.message.subscriber

/**
 * Register to listen for resources
 */
case class Register(name: String, datacenter: Option[String])

object Register {
   def apply(name: String) : Register = new Register(name, None)
   def apply(name: String, datacenter: String) : Register = new Register(name, Some(datacenter))
}
