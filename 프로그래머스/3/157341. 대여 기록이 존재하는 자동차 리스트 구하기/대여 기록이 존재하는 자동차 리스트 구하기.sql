SELECT c.CAR_ID from CAR_RENTAL_COMPANY_CAR c left join CAR_RENTAL_COMPANY_RENTAL_HISTORY h on c.CAR_ID = h.CAR_ID
where date_format(start_date,'%m')='10' and CAR_TYPE='세단' group by 1 order by 1 desc;