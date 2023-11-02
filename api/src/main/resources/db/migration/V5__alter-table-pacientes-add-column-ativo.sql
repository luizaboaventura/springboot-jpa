alter table pacientes add ativo tinyint null;
update pacientes set ativo =1;