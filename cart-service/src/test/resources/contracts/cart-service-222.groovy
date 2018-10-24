package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        urlPath('/cart-items') {
            queryParameters {
                parameter 'customer' : "222"
            }
        }
    }
    response {
        status OK()
        body("""
            [
                {
                    "id": 2,
                    "customer": "222",
                    "product": "CCC",
                    "quantity": 12
                },
                {
                    "id": 3,
                    "customer": "222",
                    "product": "DDD",
                    "quantity": 13
                },
                {
                    "id": 4,
                    "customer": "222",
                    "product": "EEE",
                    "quantity": 14
                }
            ]
        """)
        headers {
            contentType('application/json')
        }
    }
}