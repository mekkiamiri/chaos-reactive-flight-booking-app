flight model:
 - list of proposed itineraries: list of segments for departure and list of segment for return
 - 1 selected itinerary = ist of segments (1 for oneway and 2 for round trip)
 - 1 itinerary specification
 - 1 segment = origin, destinations, departure datetime, arrival datetime, flight number, price


Command 1: Search flights:
    - when command received, create aggregate and raise event
    - store aggregate and return its id
    - prepare flight results by calling external service

Query 1 : request departure segments
Command 2: select segment
    - add segment to aggregate and save it
Query 2: request return segments
Command 3 : see previous command