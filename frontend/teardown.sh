#!/bin/bash
#stopping container

echo "stopping container!"
docker stop $(docker ps --filter "ancestor=my-playground" --format "{{.Names}}")
echo "container stopped!"
echo "deleting image!"
docker rmi $(docker images --filter "reference=my-playground" --format "{{.ID}}")
echo "image deleted! byeee!"