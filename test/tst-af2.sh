#!/bin/sh

curl -s -X 'GET' 'https://jobstream.api.jobtechdev.se/stream?date=2024-04-24T15%3A00%3A00' -H 'accept: application/json' > foo.json

cat foo.json | jq '.'
