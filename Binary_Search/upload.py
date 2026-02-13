import boto3
import os

# ---------- CONFIG ----------
bucket_name = "homeservice-s3bucket"
region = "your-aws-region"         # e.g. "ap-south-1"
access_key = "YOUR_ACCESS_KEY"
secret_key = "YOUR_SECRET_KEY"

# Local file you want to upload
local_file_path = "caregiver-specialisation-1.jpeg"

# S3 destination path (must match how you use it in your app)
s3_key = "media/App Static Media/caregiver specialisation 1.jpeg"

def upload_to_s3():
    s3 = boto3.client(
        "s3",
        region_name=region,
        aws_access_key_id=access_key,
        aws_secret_access_key=secret_key,
    )

    try:
        s3.upload_file(
            Filename=local_file_path,
            Bucket=bucket_name,
            Key=s3_key,
            ExtraArgs={"ACL": "public-read", "ContentType": "image/jpeg"},
        )

        print("✔ Upload successful!")
        print("File URL:")
        print(f"https://{bucket_name}.s3.amazonaws.com/{s3_key.replace(' ', '+')}")

    except Exception as e:
        print("❌ Upload failed:", e)

if __name__ == "__main__":
    upload_to_s3()
