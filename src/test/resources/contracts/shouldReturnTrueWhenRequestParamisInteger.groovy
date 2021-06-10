import org.springframework.cloud.contract.spec.Contract
Contract.make {
  description "should return even when number input is even"
  request{
    method GET()
    url("/validate/integer") {
      queryParameters {
        parameter("number", "2")
      }
    }
  }
  response {
    body("TRUE")
    status 200
  }
}