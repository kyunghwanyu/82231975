from flask import Flask, jsonify

app = Flask(__name__)

# 사번을 반환하는 API 엔드포인트
@app.route("/api/v1/user", methods=["GET"])
def get_user():
    # 고정된 사번을 응답 데이터로 반환
    return jsonify({"employee_id": "82231975"})

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)