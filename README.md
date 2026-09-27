# University Lost and Found

## Description
University Lost and Found is a Java application for registering lost and found items at a university.

The project demonstrates the use of software design patterns and allows different tracking services to be used for processing lost and found item requests.

## Design Patterns

### Bridge Pattern
The Bridge pattern separates the lost/found request from the tracking service implementation.

Main classes:
- LostFoundRequest
- LostItemRequest
- FoundItemRequest
- TrackingService
- DatabaseTrackingService
- QRTrackingService

### Adapter Pattern
The Adapter pattern allows the new system to work with the legacy lost and found system.

Main classes:
- LegacySystemAdapter
- OldLostFoundSystem

## Testing
JUnit 5 is used for unit testing.

The project includes tests for:
- Lost and found item requests
- Legacy system adapter
- Tracking service selection

All 8 tests pass successfully.

## Technologies
- Java
- Maven
- JUnit 5
- IntelliJ IDEA

## Author
Gauhar
