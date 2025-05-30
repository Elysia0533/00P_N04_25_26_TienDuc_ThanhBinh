# springBoot

# Model
[Document of Spring Boot Model Manual](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/ui/Model.html)

```
Model addAttribute(Object attributeValue)
```
Add the supplied attribute to this Map using a generated name.

Example
```
ArrayList<User> listOfArray = new ArrayList<User>();
		userAiven ua = new userAiven();
		listOfArray = ua.userAivenList();

		model.addAttribute("listOfArray", listOfArray);
```
