stumps-messages
===============

This is a shared library containing all of the messages used for communication
between the various stump components (provider, stump-server, clients). The
message classes are broken up into three different namespaces

* *common* - common classes for both providers and subscribers
* *provider* - classes used by providers to manage resource registration
* *subscriber* - classes used by subscribers to manage resource subscriptions
