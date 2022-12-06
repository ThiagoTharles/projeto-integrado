CREATE TABLE IF NOT EXISTS student(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS tag(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS pomodoro (
	id SERIAL PRIMARY KEY,
	shortBreak INT DEFAULT 5,
	longBreak INT DEFAULT 30,
	pomodoro INT DEFAULT 25,
	cycle INT DEFAULT 0,
	status VARCHAR(25) DEFAULT 'reset'
);

CREATE TABLE IF NOT EXISTS activity(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	description VARCHAR(250),
	tag INT,
	pomodoro INT,
	student INT NOT NULL,
	FOREIGN KEY(tag) REFERENCES tag(id),
	FOREIGN KEY(pomodoro) REFERENCES pomodoro(id),
	FOREIGN KEY(student) REFERENCES student(id)
);

CREATE TABLE IF NOT EXISTS dashboard (
	id SERIAL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS dashboard_activity (
	activity int,
	dashboard int,
	FOREIGN KEY(activity) REFERENCES activity(id),
	FOREIGN KEY(dashboard) REFERENCES dashboard(id),
	PRIMARY KEY(activity, dashboard)
);