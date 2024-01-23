
return [
    DATABASE_URL: 'jdbc:mysql://dev-db-server:3306/dev_database',
    API_URL: 'http://dev-api-server:8080/api'

    if (environment == 'dev') {
        imagename = "nginx"
    }
    APP_IMAGE_NAME = "${imagename}"
]