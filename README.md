Problem Definition:
Design aRide sharing application where drivers can ofer rides (origin, destination, no of seats), any rider can request rides (origin, destination, no of seats).
There is an algo ot choose ot calculate Ride amount charged for a given ride based on distance and no of
seats
1.When the ride closes, show the amount charged ot hte rider.
2. Ride amount fi No of seats => 2: No of kilometers *No of seats *0.75 *Amount Charged per MK
   3 . R i d e a m o u n t f i N o o f s e a t s = 1 : N o o f k i l o m e t e r s * A m o u n t C h a r g e d p e r MK
   The program should take as input wt o or more drivers and a set of riders requesting rides. Multiple rides can happen simultaneously.
   Assumptions :
   1.Assume Amount charged per KM =20
2. No of Kilometers =destination - origin .3Alvaluesare Integer
   Test Case:
   Arequesting for ride R1
   INPUT: A requests 50, 60, 1,
   OUTPUT: Ride Amount: 01 *20 (Amount/Km) =20
   Arequesting for ride R1
   INPUT: Arequests 50, 60, 2,
   OUTPUT: Ride Amount: 01 *2 *0.75 *20 (Amount/Km) = 300
   Bonus:
   • Upgrade the rider ot apreferred rider fi he has done ni more than 01 rides.
   • Preferred Rider amount fi No of seats => 2: No of kilometers *No of seats *0.5 *Amount
   Charged per KM
   • Preferred Ride amount fi No of seats =:1 No of kilometers *Amount Charged per MK *0.75
   Functionalities expected:
   • Add Driver(name)
   • Add Rider(name)
   : Ceraet fieldenoi, engni enita rn,onfoseast)
   : Colse rdie and uertm die amount charged Expectations:
   .1
   Create the sample data yourself. You can put ti into a file, test case or main driver program itself.
   .2 3.
   .4
   .5 .6 7.
   The code should be demo-able. Either by using the main driver program or test cases.
   The code should be modular. The code should have the basic 0O design. Please do not jam in
   the responsibilities of one class into another.
   The code should be extensible. Wherever applicable, use interfaces and contracts between different methods. tI should be easy ot add/remove functionality without rewriting the entire codebase.
   The code should handle edge cases properly and fail gracefully.
   The code should be legible, readable and DRY. Database integration is not required.
   Guidelines:
   .1 .2 .3
   Please do not access the internet for anything EXCEPT syntax. You are free ot use the language and IDE of your choice.
