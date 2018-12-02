create table parking_boy (
    id              bigint          not null    auto_increment,
    employee_id     varchar(64)     not null,
    primary key (id),
    unique(employee_id)
)