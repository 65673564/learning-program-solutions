# Sub-Exercise 1: Mocking and Stubbing

## Scenario:
You are testing a service that depends on a repository. The repository should be mocked to avoid using a real database.

## Objectives:
- Use `@Mock` to mock a dependency
- Use `when(...).thenReturn(...)` to stub a response
- Assert correct return value from the service layer
