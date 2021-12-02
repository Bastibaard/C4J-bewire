# C4J-bewire
Project voor hackthefuture

## POST -> /team:


```json{
    "name": "The RAID rebuilders",
    "id": "442e272c-5fc0-4fa6-93f5-f03121e30ac4"
}```

## GET -> /case/07fd951b-6ec3-430e-a596-02bf2a819c52:


```json{
    "caseId": "07fd951b-6ec3-430e-a596-02bf2a819c52",
    "investigations": [
        {
            "id": "e962d565-01bc-4722-b2f6-f3a8c8465e41",
            "investigation": "Brute force the password. It can contain upper/lowercase alphanumeric characters",
            "investigationParameters": "",
            "attemptsRemaining": "Unlimited",
            "outcome": null
        },
        {
            "id": "83d83ee8-c71f-4d2b-aad8-35b231495b18",
            "investigation": "Convert the following String to hexadecimal value (Use a space delimiter between values)",
            "investigationParameters": "9Oqopcyl4RQa",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "098fbde5-ffa2-4e60-a218-c7d6b325a531",
            "investigation": "Decode the following String. It uses a quite common encoding, find out which!",
            "investigationParameters": "MVdNcmpYeFBqTlJyR2hJcklHSWttQTlhaXQzZHBmbHZEZUYzNmFrbGNxWg==",
            "attemptsRemaining": "10",
            "outcome": null
        },
        {
            "id": "c0613a4e-8f5d-4a17-9ff6-7fd961ef4f59",
            "investigation": "Find the missing numbers in the sequence. Return them as a comma-separated string",
            "investigationParameters": "[0,1,2,3,13,21,34,55,89,144,233,377,610,987,2584,4181,0,1,1,3,8,13,21,34,55,144,377,610,987,1597,2584,4181,0,2,5,8,13,21,34,55,89,144,233,377,610,1597,4181,0,1,2,3,5,8,13,21,34,89,233,377,610,987,1597,4181,0,1,1,3,8,13,21,34,55,89,144,987,1597,2584,4181,0,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,4181,1,1,3,5,8,13,21,34,55,89,233,377,610,987,2584,4181,0,1,1,2,3,5,13,21,34,89,144,233,377,987,2584,4181,0,1,2,3,5,8,13,34,55,89,144,233,377,610,2584,4181,0,1,1,2,5,8,21,34,89,144,233,377,987,1597,2584,4181,0,1,1,3,5,13,21,55,89,144,610,987,1597,2584,4181,0,1,1,2,3,8,13,55,89,233,377,610,1597,2584,4181,0,1,1,2,3,5,13,21,34,55,89,610,987,1597,2584,4181,0,1,1,3,5,8,21,55,89,144,233,377,610,2584,4181,0,1,2,3,8,13,55,89,233,377,610,987,1597,2584,4181,0,1,2,3,5,13,21,55,89,144,233,377,987,1597,2584,4181,1,2,3,8,13,21,34,55,89,144,233,610,987,1597,2584,4181,0,1,2,5,13,21,34,55,144,233,377,610,987,1597,2584,4181,0,1,1,2,8,13,21,34,89,144,233,610,987,2584,4181,0,1,2,3,5,8,13,34,55,89,144,610,987,1597,2584,4181,0,1,1,2,5,8,13,21,34,55,89,144,377,987,1597,2584,4181,0,1,2,3,5,8,21,89,144,233,377,610,987,1597,4181,0,1,1,2,5,8,13,21,34,89,233,377,987,1597,2584,4181]",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "7c53a11c-bd65-4bfd-95e1-fa5eee4bff43",
            "investigation": "Reverse the following String",
            "investigationParameters": "Dw7mfcXT2BzlRWSlCCsPuSKIAbHcKX7MFO0WmLcSFewn5KcwPMOt4OngHAySEOfHXuWAA9FVJ0c1uubZe8EZkuzwNU7QgaKKkL8l2hjzrgGwxU5nfbgrAgrwH63IG",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "761da2b7-1ca7-4a96-ad02-ed874d892e52",
            "investigation": "Answer is the first and last day of the month (MONDAY - SUNDAY) eg: MONDAY-FRIDAY",
            "investigationParameters": "{\"month\":\"5\",\"year\":\"1991\"}",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "5e5903fa-912d-498a-b22c-55755bdb8dc0",
            "investigation": "Is the following string in alphabetical order? (Use N or Y as answer)",
            "investigationParameters": "001244799AAACCEFHIIIJKMOPPPTTUUVWWXXYYYZZaabdefgijklmmnpprrrsuuvvwwxxyy",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "60d43193-2760-43e1-b918-6507d9032b54",
            "investigation": "Replace string at given index in arraylist",
            "investigationParameters": "{\"index\":\"1\",\"arrayList\":\"[cxT, qm8F, 2dK, 1SZl, RLh, 1ie, Fah, zedg, jJ4p, hyi3]\",\"replacement\":\"HMrD\"}",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "bcf167ad-376e-4049-a1ab-7434c11656d5",
            "investigation": "Return element at index of the given hashmap",
            "investigationParameters": "{\"index\":\"4\",\"hashmap\":\"{1=igzJ, 2=3xHc, 3=ERs, 4=S6p, 5=7SZO}\"}",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "7a26266a-12f5-4b4c-a666-58ce4f0b762a",
            "investigation": "What is the Perfect Number in the nth position (1-based)?",
            "investigationParameters": "{\"nth element\":\"1\"}",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "c7e50832-4017-43d0-8229-b591b9ee7d2b",
            "investigation": "Decode the following string",
            "investigationParameters": "--- ..-. ... .... --. -.. -..- -.-. ... .-",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "4c62efdd-522c-4b85-a51f-70d13881b6a6",
            "investigation": "Is the following number a Disarium Number? (Use N or Y as answer)",
            "investigationParameters": "2",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "36701a7d-c3c4-4797-8c09-c21fd2f33b9e",
            "investigation": "Find all the primes between the start and end index (both inclusive)",
            "investigationParameters": "{\"start\":50668,\"end\":50768}",
            "attemptsRemaining": "1",
            "outcome": null
        },
        {
            "id": "80e12000-b972-4ce1-8a97-e7a9d25df207",
            "investigation": "The following string is encrypted with an ancient algorithm, invented in one of the mightiest empires of all time.Tip: one of the leaders of this empire.",
            "investigationParameters": "zbsqabqjiu",
            "attemptsRemaining": "Unlimited",
            "outcome": null
        }
    ]
}```
