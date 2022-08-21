CREATE TABLE airlines (
  airlines_id number NOT NULL,
  airlines_at_id number NOT NULL,
  airlines_name varchar(255) NOT NULL,
  airlines_no varchar(255) NOT NULL,
  airlines_from number NOT NULL,
  airlines_deaprture varchar(255) NOT NULL,
  airlines_to number NOT NULL,
  airlines_arrival varchar(255) NOT NULL,
  airlines_travel_time varchar(255) NOT NULL,
  airlines_total_distance number NOT NULL
);

--
-- Table structure for table airlines_type
--

CREATE TABLE airlines_type (
  at_id number NOT NULL,
  at_name varchar(255) NOT NULL
);


--
-- Table structure for table booking
--

CREATE TABLE booking (
  booking_id number NOT NULL,
  booking_user_id varchar(255) NOT NULL,
  booking_route_id varchar(255) NOT NULL,
  booking_date varchar(255) NOT NULL,
  booking_total_fare varchar(255) NOT NULL,
  booking_journey_date varchar(255) NOT NULL,
  booking_seat_type varchar(255) NOT NULL,
  booking_status varchar(255) NOT NULL DEFAULT '0'
);

--
-- Table structure for table city
--

CREATE TABLE city (
  city_id number UNSIGNED NOT NULL,
  city_name varchar(45) NOT NULL
);

--
-- Table structure for table passengar
--

CREATE TABLE passengar (
  passengar_id number NOT NULL,
  passengar_booking_id varchar(255) NOT NULL,
  passengar_type varchar(255) NOT NULL,
  passengar_name varchar(255) NOT NULL,
  passengar_gender varchar(255) NOT NULL,
  passengar_age varchar(255) NOT NULL,
  passengar_seat_no varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Table structure for table route
--

CREATE TABLE route (
  route_id number NOT NULL,
  route_airlines_id varchar(255) NOT NULL,
  route_from_city varchar(255) NOT NULL,
  route_from_arrival varchar(255) NOT NULL,
  route_from_departure varchar(255) NOT NULL,
  route_to_city varchar(255) NOT NULL,
  route_economy_fare varchar(255) NOT NULL,
  route_business_fare varchar(255) NOT NULL
);