This is an attempt to do some simple data structures using a test-first methodology.

Goal #1: A simple Set data structure

What I did so far:
1) defined a MiniSet interface
2) wrote some test code to check ANY MiniSet Impl against my base expectations for a Set
3) decided that I would implement a MiniSet using a list
4) so I defined a MiniList interface
5) wrote some test code to check ANY MiniList Impl against my base expectations for a List
6) wrote a MiniLinkedList
7) extended the MiniList test code into a JUnit5 test to check my Impl
8) wrote a MiniLinkedSet, using my MiniLinkedList
9) extended the MiniSet test code into a JUnit5 test to check my Impl

Overall, it works, but it was not entirely test-first.