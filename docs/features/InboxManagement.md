# Inbox management
## Description
There is a central element in the system named INBOX that holds all the items inside and represents a
list with additional functionality (will be described in separate sections below). As a general features of
the inbox there are: adding item, removing item, prioritizing items, etc.

## Diagrams
![img.png](img.png)


[Open in PlantUml](http://www.plantuml.com/plantuml/uml/LO_12i9034Jl-OhyW8WzUf2AHV0gz0FIDfI5kWcR5FnyTotITG_3C6zc8Qqv9LzV2z3ead1xlV7F8XdUHK1pBOn1AJe-uY3lg-gEJp2Hqq369Uigl_4682iUBjyodd5cFwfObjLHb1Dva0Y5LgtoAMgIaSr2d6lSP7nxzjt_kAd6YMrTlDxiOSjnoaT_0000)


## Features
### Add item to inbox
With help of this feature user can add new item to the inbox.
## REST API
````
    https://inbox.com/item
````

## Data Model
For more details, please refer to the data [design section](#Data-design)

## Table InboxItem:

| Column      | Type          | Description                                         |
|-------------|---------------|-----------------------------------------------------|
| id          | UUID          | Used as unique identifier                           |
| name        | String        | Name of the item                                    |
| description | String        | Item description                                    |
| created     | LocalDateTime | Created time of item                                |
| updated     | LocalDateTime | Updated time of item                                |
| status      | String        | Status of item (ACTIVE, INACTIVE, UNKNOWN, DELETED) |


## Data design