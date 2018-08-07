Install rabbitmq through home brew
```brew install rabbitmq```

To start the rabbitmq server go to the installed location and run 
```./rabbitmq-server```

To find the installed location in homebrew type  
```brew info rabbitmq```

In the ide:  
add rabbitmq maven dependency

import the necessary headers

run the send and receive code.

To see the number of items in the queue :   
```./rabbitmqctl list_queues```  
rabbitmqctl is in the sbin of the installed location

> author : chandan
