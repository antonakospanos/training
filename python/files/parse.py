#!/usr/local/bin/python3


# Backup all hosts
hosts = open("/etc/hosts", "r")
backup = open("/tmp/hosts", "w")

for line in hosts:
    backup.write(line.rstrip() + "\n")

backup.close()
hosts.close()


# Print all archived hosts
backup = open("/tmp/hosts", "r")

for line in backup:
    print(line.rstrip())

backup.close()
