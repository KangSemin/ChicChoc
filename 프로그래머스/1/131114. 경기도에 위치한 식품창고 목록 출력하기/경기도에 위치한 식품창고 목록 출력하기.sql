SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, coalesce(FREEZER_YN,'N') from FOOD_WAREHOUSE 
where substr(address,1,3)='경기도'order by 1;