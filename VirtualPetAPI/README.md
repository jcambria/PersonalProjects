
How to use:
first, create a sql server in git bash to store pet data (would work if an online server is made, but that costs $$$)

the prompt to make the server is:
mysql -u root -e "CREATE DATABASE javathehuttapi"

in the app properties:
spring.jpa.hibernate.ddl-auto=update - this will keep the pets there when the server is shut down.
spring.jpa.hibernate.ddl-auto=create-drop - this will get rid of the pets each time the server is reset.

post these curl commands into git bash, these will populate the first 4 pets, if not, admitting pets manually will work.

curl -X POST http://localhost:8080/dog -H 'Content-Type: application/json' -d '{"name": "jeff"}'
curl -X POST http://localhost:8080/cat -H 'Content-Type: application/json' -d '{"name": "doug"}'
curl -X POST http://localhost:8080/dog -H 'Content-Type: application/json' -d '{"name": "rex"}'
curl -X POST http://localhost:8080/cat -H 'Content-Type: application/json' -d '{"name": "fluffy"}'

then enjoy playing around in your virtual pet shelter!
