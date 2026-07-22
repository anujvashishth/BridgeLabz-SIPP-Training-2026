use covid_d
show tables;
RENAME TABLE `covid_19_india - covid_19_india` TO covid_india;
select * from covid_d.covid_india limit 20;
RENAME TABLE `covid_vaccine_statewise - covid_vaccine_statewise` TO covid_vaccine_statewise
RENAME TABLE `statewisetestingdetails - statewisetestingdetails` To statewisetestingdetails
select * from covid_d.covid_vaccine_statewise limit 20;
select * from covid_d.statewisetestingdetails limit 20;
select *
from covid_india
Where Deaths>100
AND Confirmed>5000 limit 10;

Select * 
from covid_india
where Confirmed BETWEEN 5000 AND 10000;

Select MAX(Confirmed)
From covid_india;

Select MAX(Deaths)
From covid_india;

Select `State/UnionTerritory`, Confirmed, Deaths
From covid_india
order by Confirmed DESC
LIMIT 20;

select `State/UnionTerritory` As State, Confirmed, Deaths
From covid_india
Where `State/UnionTerritory` LIKE '%ra%';

Select Deaths
From covid_india
order by Deaths ASC
limit 20;

select count(*)
From covid_india
Where `State/UnionTerritory` LIKE '%ra%';

Select `State/UnionTerritory`,
       COUNT(*) AS total_records
From covid_india
Group by `State/UnionTerritory`

Select `State/UnionTerritory`, Sum(Confirmed)
From covid_india
Group by `State/UnionTerritory`
having Sum(Confirmed)>200

Select *
from covid_india
Where Deaths = ( 
                 Select max(Deaths)
                 From covid_india
);

