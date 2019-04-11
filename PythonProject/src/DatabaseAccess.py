import cx_Oracle

# Open database connection
db = cx_Oracle.connect("localhost","testuser","test123","TESTDB" )

# prepare a cursor object using cursor() method
cursor = db.cursor()

# execute SQL query using execute() method.
cursor.execute("SELECT 'ABC' FROM DUAL")

# Fetch a single row using fetchone() method.
data = cursor.fetchone()

print "Print Value From DB : %s " % data

# disconnect from server
db.close()

