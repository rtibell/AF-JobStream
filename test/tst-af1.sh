#!/bin/sh

#curl -s -X 'GET' 'https://jobstream.api.jobtechdev.se/stream?date=2024-04-22T12%3A59%3A27' -H 'accept: application/json' > foo.json
curl -s -X 'GET' 'https://jobstream.api.jobtechdev.se/stream?date=2024-04-23T15%3A59%3A27' -H 'accept: application/json' -H 'Content-Type: application/json' -H 'user-agent: superagent/1.0'

#cat foo.json | jq '.'
