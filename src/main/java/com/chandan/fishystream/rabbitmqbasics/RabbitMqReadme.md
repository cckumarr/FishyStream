install rabbitmq through home brew
brew install rabbitmq

to start the rabbitmq server go to the installed location and run ./rabbitmq-server

to find the installed location in homebrew type brew info rabbitmq

in the ide:
add rabbitmq maven dependency

import the necessary headers

run the send and receive code.

to see the number of items in the queue : ./rabbitmqctl list_queues
rabbitmqctl is in the sbin of the installed location

author : chandan
