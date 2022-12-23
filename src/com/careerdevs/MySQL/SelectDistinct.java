


//to find a value,  where the beginning and end of data does not start with a vowel.

Select distinct city FROM station where left(city,1) not in ('a','e','i','o','u') or right(city,1) not in ('a','e','i','o','u');

// to find a value , where it doesnt start with or end with a vowel, we also want a distinct value.
Select distinct City from Station where  left(city,1) not in ('a','e','i','o','u') and right(city,1) not  in ('a','e','i','o','u');