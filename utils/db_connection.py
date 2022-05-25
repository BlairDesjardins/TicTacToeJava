import psycopg2
from psycopg2 import OperationalError

def create_connection():
    try:
        conn = psycopg2.connect(
            database='postgres',
            user='postgres',
            password='password',
            host='tictactoe-database.cfnl7bnhgahp.us-east-2.rds.amazonaws.com',
            port='5432'
        )
        return conn
    except OperationalError as e:
        print(e)
        return(None)

connection = create_connection()


def _test():
    print(connection)

if __name__ == '__main__':
    _test()