

## 1 

* Fix the models to be able to capture the request data

 - `ProductOrder`
 - `ProductOrderItem` 


## 2



```json
{   
   "category":"Sample product order",
   "description":"Product Order sample",
   "productOrderItem":[
      {
         "id":"100",
         "quantity":1,
         "type":"bundle",
         "name":"Line1",         
      },
      {
         "id":"110",
         "quantity":1,
         "type":"hardware",
         "name":"iphone11",
         "relationship" : "100"         
      },
      {
         "id":"120",
         "quantity":2,
         "type":"hardware",
         "name":"earphones",
         "relationship" : "100"         
      },
      {
         "id":"130",
         "quantity":1,
         "type":"hardware",
         "name":"sim",
         "relationship" : "100"         
      },
      {
         "id":"410",
         "quantity":1,
         "type":"service",
         "name":"Plan499",
         "relationship" : "100"         
      },
      
      
      {
         "id":"1100",
         "quantity":1,
         "type":"bundle",
         "name":"Line2"         
      },
      {
         "id":"1111",
         "quantity":1,
         "type":"hardware",
         "name":"galaxy",
         "relationship" : "1100"                  
      },
      {
         "id":"1120",
         "quantity":2,
         "type":"hardware",
         "name":"earphones",
         "relationship" : "1100"
      },
      {
         "id":"1130",
         "quantity":1,
         "type":"hardware",
         "name":"sim",
         "relationship" : "1100"
      },
      {
         "id":"1410",
         "quantity":1,
         "type":"service",
         "name":"Plan599",
         "relationship" : "1100"
      },
      {
         "id":"1151",
         "quantity":1,
         "type":"vendorservice",
         "name":"disneyplus",
         "relationship" : "1100"
      }            
   ]
}

```



* Write the service with a datastructure for bundle type and its bundled items so that below is output printed for each of the bundle type, for the above json as the input to the service

* Logic should support any number of the bundles and its items


**Expected output:**

```
Total number of Bundles : 2 

Bundle Name: Line1
Service: Plan499
Hardware: ihpone11,earphone,sim

Bundle Name: Line2
Service: Plan599
Hardware: Galaxy,earphone,sim
VendorService: disneyplus

```
