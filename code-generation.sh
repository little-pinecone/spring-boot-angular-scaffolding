#!/bin/bash
cd backend
mvn clean verify -Pangular -Dspring.profiles.active=dev -DskipTests