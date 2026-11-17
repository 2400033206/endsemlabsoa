STS ADDITION API PROJECT

REQUIREMENTS:
- Spring Tool Suite 4
- JDK 17 or compatible JDK
- Internet connection for first Maven dependency download

IMPORT:
1. Extract this ZIP file.
2. Open STS.
3. Choose File > Import.
4. Choose Maven > Existing Maven Projects.
5. Select the extracted STS_Addition_API_Project folder.
6. Select pom.xml and click Finish.
7. Wait until Maven downloads dependencies.
8. Open DemoApplication.java.
9. Right-click > Run As > Spring Boot App.

TEST:
GET http://localhost:8080/ms/add?num1=10&num2=20

Expected JSON:
{
  "num1": 10,
  "num2": 20,
  "result": 30
}

YAML CONTRACT:
src/main/resources/contracts/add-api.yaml

IMPORTANT:
The YAML file defines/document the API contract. The Java controller implements
the endpoint. This project does not generate Java code automatically from YAML.
