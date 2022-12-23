


//to find a value,  where the beginning and end of data does not start with a vowel.

Select distinct city FROM station where left(city,1) not in ('a','e','i','o','u') or right(city,1) not in ('a','e','i','o','u');